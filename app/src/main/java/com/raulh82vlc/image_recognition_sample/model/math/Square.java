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

package com.raulh82vlc.image_recognition_sample.model.math;

/**
 * Square shape
 * @author Raul Hernandez Lopez.
 */

public class Square {
    private Point start;
    private int width;
    private int height;

    public Square(Point start, int width, int height) {
        this.start = start;
        this.width = width;
        this.height = height;
    }

    public Point getStart() {
        return start;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
