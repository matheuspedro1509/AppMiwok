package com.example.matheus.appcurso3;

/**
 * Created by re034848 on 10/05/2017.
 */

public class Palavra {

    private String mTraducaoDefault;

    private String mTraducaoMiwok;

    private int mImagemId=NO_IMAGE_PROVIDED;

    private int mAudio;

    /** Constant value that represents no image was provided for this word*/
    private static final int NO_IMAGE_PROVIDED = -1;


    public Palavra(String traducaoDefault,String traducaoMiwok,int audio){
        mTraducaoDefault=traducaoDefault;
        mTraducaoMiwok=traducaoMiwok;
        mAudio=audio;
    }

    public Palavra(String traducaoDefault,String traducaoMiwok,int imagemId,int audio){
        mTraducaoDefault=traducaoDefault;
        mTraducaoMiwok=traducaoMiwok;
        mImagemId=imagemId;
        mAudio=audio;
    }

    public String getTraducaoDefault() {
        return mTraducaoDefault;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getTraducaoMiwok() {
        return mTraducaoMiwok;
    }

    public int getImagemId(){
        return mImagemId;
    }


    public boolean hasImage() {
        return mImagemId != NO_IMAGE_PROVIDED;
    }


    public int getmAudio(){return mAudio;}



}
