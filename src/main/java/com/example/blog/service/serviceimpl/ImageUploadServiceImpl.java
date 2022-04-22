package com.example.blog.service.serviceimpl;

import com.example.blog.repos.UploadPImages;
import com.example.blog.service.ImageUploadservice;

public class ImageUploadServiceImpl implements ImageUploadservice {
    @Override
    public void uploadProfile(String email, String url) {
        UploadPImages uploadPImages = new UploadPImages();
        uploadPImages.uploadProfile(email,url);
    }

    @Override
    public void uploadCover(String email, String url) {
        System.out.println("call method");
        UploadPImages uploadPImages = new UploadPImages();
        uploadPImages.uploadCover(email,url);
    }
}
