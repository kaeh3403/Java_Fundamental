package java_201906014;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QrcodeDemo {
	public boolean isCreateQRcode(String text) throws Exception{
		QRCodeWriter writer = new QRCodeWriter();
		BitMatrix qrCode = writer.encode(text, BarcodeFormat.QR_CODE, 300, 300);
		//이미지 생성
		BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(qrCode);
		
		File f = new File("c:\\down\\QRCODE.png");
		//boolean isSuccess = ImageIO.write(qrImage, "PNG", f);
		return ImageIO.write(qrImage, "PNG", f);
		
	}
	public static void main(String[] args) throws WriterException, IOException {
		
				
				
	}
}
	