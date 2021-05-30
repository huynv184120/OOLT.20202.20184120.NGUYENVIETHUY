package space3D;

import java.util.ArrayList;
import java.util.List;

public class Camera {
	public Point camPosition;
	public double angleHeight; // Goc cao
	public double angleWidth; // Goc rong
	public Plane3D topPlane; // mat phang camera nam tren
	public Plane3D botPlane;// mat phang doi cam
	public Plane3D oppositePlane;
	public double heightCam; // tam xa camera
	public List<Point> listPointInOppsite = new ArrayList<Point>();

	public Camera(Point camPosition, double angleHeight, double angleWidth) {
		super();
		this.camPosition = camPosition;
		this.angleHeight = Math.toRadians(angleHeight);
		this.angleWidth = Math.toRadians(angleWidth);
	}

// Lay 4 dinh cua vung nhin thay
	public void setlistPointInOppsite() {
		// Tinh chieu cao chop tu giac
		this.heightCam = Calculate3D.distancePointPlane(camPosition, oppositePlane);
		// Tim hinh chieu camera den mat doi dien
		Point projectionInOp;
		projectionInOp = Calculate3D.ProjectionPointToPlane(this.getCamPosition(), oppositePlane);
		double deltaZ = this.heightCam * Math.tan(angleHeight / 2);
		if (Calculate3D.scalar(oppositePlane.getN(), new Vector3D(1, 0, 0)) == 0) {
			double deltaX = this.heightCam * Math.tan(angleWidth / 2);
			listPointInOppsite.add(
					new Point(projectionInOp.getX() + deltaX, projectionInOp.getY(), projectionInOp.getZ() + deltaZ));
			listPointInOppsite.add(
					new Point(projectionInOp.getX() - deltaX, projectionInOp.getY(), projectionInOp.getZ() + deltaZ));
			listPointInOppsite.add(
					new Point(projectionInOp.getX() + deltaX, projectionInOp.getY(), projectionInOp.getZ() - deltaZ));
			listPointInOppsite.add(
					new Point(projectionInOp.getX() - deltaX, projectionInOp.getY(), projectionInOp.getZ() - deltaZ));
		} else {
			double deltaY = this.heightCam * Math.tan(angleWidth / 2);
			listPointInOppsite.add(
					new Point(projectionInOp.getX(), projectionInOp.getY() + deltaY, projectionInOp.getZ() + deltaZ));
			listPointInOppsite.add(
					new Point(projectionInOp.getX(), projectionInOp.getY() - deltaY, projectionInOp.getZ() + deltaZ));
			listPointInOppsite.add(
					new Point(projectionInOp.getX(), projectionInOp.getY() + deltaY, projectionInOp.getZ() - deltaZ));
			listPointInOppsite.add(
					new Point(projectionInOp.getX(), projectionInOp.getY() - deltaY, projectionInOp.getZ() - deltaZ));
		}
	}

	// Check 1 diem co thuoc vung nhin thay cua camera ko
	public boolean checkPointInVisibleAreaOfCam(Point position) {
		Rectangle rec = new Rectangle(listPointInOppsite.get(0), listPointInOppsite.get(1), listPointInOppsite.get(2),
				listPointInOppsite.get(3));
		
		Point insecPosition = Calculate3D.intersectionLinePlane(new Line3D(position ,this.camPosition), oppositePlane);
		if(insecPosition == null) return false;
		double areaRec = Calculate3D.areaRectangle(rec);
		double sumTri = Calculate3D.areaTriangle(new Triangle(insecPosition, rec.getVertexA(), rec.getVertexB()))
				+ Calculate3D.areaTriangle(new Triangle(insecPosition, rec.getVertexB(), rec.getVertexC()))
				+ Calculate3D.areaTriangle(new Triangle(insecPosition, rec.getVertexC(), rec.getVertexD()))
				+ Calculate3D.areaTriangle(new Triangle(insecPosition, rec.getVertexD(), rec.getVertexA()));
	
		return Math.abs(areaRec - sumTri) < 1e-5;
	}

	public Point getCamPosition() {
		return camPosition;
	}

	public void setCamPosition(Point camPosition) {
		this.camPosition = camPosition;
	}

	public double getAngleHeight() {
		return angleHeight;
	}

	public void setAngleHeight(double angleHeight) {
		this.angleHeight = angleHeight;
	}

	public double getAngleWidth() {
		return angleWidth;
	}

	public void setAngleWidth(double angleWidth) {
		this.angleWidth = angleWidth;
	}

	public Plane3D gettopPlane() {
		return topPlane;
	}

	public void settopPlane(Plane3D upperPlane) {
		this.topPlane = upperPlane;
	}

	public Plane3D getTopPlane() {
		return topPlane;
	}

	public void setTopPlane(Plane3D topPlane) {
		this.topPlane = topPlane;
	}

	public Plane3D getOppositePlane() {
		return oppositePlane;
	}

	public void setOppositePlane(Plane3D oppositePlane) {
		this.oppositePlane = oppositePlane;
		this.setlistPointInOppsite();
		this.settopPlane(new Plane3D(this.camPosition, listPointInOppsite.get(0),listPointInOppsite.get(1)));
		

	}
}
