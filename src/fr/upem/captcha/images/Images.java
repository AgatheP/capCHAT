package fr.upem.captcha.images;

public interface Images {
	Url getPhotos();
	Url getRandomPhotosURL(int r);
	boolean isPhotoCorrect(Url url);
}
