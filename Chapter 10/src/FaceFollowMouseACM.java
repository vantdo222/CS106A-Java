import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.*;

public class FaceFollowMouseACM extends GraphicsProgram {

    private static final int FACE_WIDTH = 300;
    private static final int FACE_HEIGHT = 300;
    private static final int EYE_RADIUS = 30;
    private static final int PUPIL_RADIUS = 10;

    private GOval leftEye;
    private GOval rightEye;
    private GOval leftPupil;
    private GOval rightPupil;

    private double leftEyeCenterX, leftEyeCenterY;
    private double rightEyeCenterX, rightEyeCenterY;

    public void run() {
        drawFace();
        addMouseListeners();
    }

    private void drawFace() {
        // Face
        GOval face = new GOval(100, 100, FACE_WIDTH, FACE_HEIGHT);
        face.setFilled(true);
        face.setColor(Color.ORANGE);
        add(face);

        // Left eye
        leftEyeCenterX = 200;
        leftEyeCenterY = 200;
        leftEye = new GOval(leftEyeCenterX - EYE_RADIUS, leftEyeCenterY - EYE_RADIUS, EYE_RADIUS * 2, EYE_RADIUS * 2);
        leftEye.setFilled(true);
        leftEye.setColor(Color.WHITE);
        add(leftEye);

        // Right eye
        rightEyeCenterX = 300;
        rightEyeCenterY = 200;
        rightEye = new GOval(rightEyeCenterX - EYE_RADIUS, rightEyeCenterY - EYE_RADIUS, EYE_RADIUS * 2, EYE_RADIUS * 2);
        rightEye.setFilled(true);
        rightEye.setColor(Color.WHITE);
        add(rightEye);

        // Pupils
        leftPupil = new GOval(leftEyeCenterX - PUPIL_RADIUS, leftEyeCenterY - PUPIL_RADIUS, PUPIL_RADIUS * 2, PUPIL_RADIUS * 2);
        leftPupil.setFilled(true);
        leftPupil.setColor(Color.BLACK);
        add(leftPupil);

        rightPupil = new GOval(rightEyeCenterX - PUPIL_RADIUS, rightEyeCenterY - PUPIL_RADIUS, PUPIL_RADIUS * 2, PUPIL_RADIUS * 2);
        rightPupil.setFilled(true);
        rightPupil.setColor(Color.BLACK);
        add(rightPupil);
    }

    public void mouseMoved(MouseEvent e) {
        updatePupilPosition(leftPupil, leftEyeCenterX, leftEyeCenterY, e.getX(), e.getY());
        updatePupilPosition(rightPupil, rightEyeCenterX, rightEyeCenterY, e.getX(), e.getY());
    }

    private void updatePupilPosition(GOval pupil, double eyeCenterX, double eyeCenterY, double mouseX, double mouseY) {
        double dx = mouseX - eyeCenterX;
        double dy = mouseY - eyeCenterY;
        double distance = Math.sqrt(dx * dx + dy * dy);

        double maxDistance = EYE_RADIUS - PUPIL_RADIUS;
        if (distance > maxDistance) {
            dx = dx * maxDistance / distance;
            dy = dy * maxDistance / distance;
        }

        double newPupilX = eyeCenterX + dx - PUPIL_RADIUS;
        double newPupilY = eyeCenterY + dy - PUPIL_RADIUS;
        pupil.setLocation(newPupilX, newPupilY);
    }

}
