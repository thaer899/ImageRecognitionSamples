/*
 * Copyright (C) 2017 Raul Hernandez Lopez @raulh82vlc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.raulh82vlc.image_recognition_sample.domain;

import com.raulh82vlc.image_recognition_sample.model.RecognisedFace;

import org.opencv.core.Mat;
import org.opencv.core.Rect;

/**
 * Face Recognition interactor contract for a Face recognition Use case
 * @author Raul Hernandez Lopez
 */

public interface FaceRecognitionInteractor {
    void execute(Mat gray, FaceCallback callback);

    /**
     * Face Callback used when OpenCV returns a face and this was transformed to {@link RecognisedFace}
     * @author Raul Hernandez Lopez.
     */
    interface FaceCallback {
        void onFaceRecognised(Rect faceOpenCV, RecognisedFace face);
    }
}
