
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/capture/mojom/video_capture_types.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class SharedMemoryViaRawFileDescriptor extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo.system.UntypedHandle fileDescriptorHandle;
    public int sharedMemorySizeInBytes;

    private SharedMemoryViaRawFileDescriptor(int version) {
        super(STRUCT_SIZE, version);
        this.fileDescriptorHandle = org.chromium.mojo.system.InvalidHandle.INSTANCE;
    }

    public SharedMemoryViaRawFileDescriptor() {
        this(0);
    }

    public static SharedMemoryViaRawFileDescriptor deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SharedMemoryViaRawFileDescriptor deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SharedMemoryViaRawFileDescriptor decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SharedMemoryViaRawFileDescriptor result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SharedMemoryViaRawFileDescriptor(elementsOrVersion);
                {
                    
                result.fileDescriptorHandle = decoder0.readUntypedHandle(8, false);
                }
                {
                    
                result.sharedMemorySizeInBytes = decoder0.readInt(12);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.fileDescriptorHandle, 8, false);
        
        encoder0.encode(this.sharedMemorySizeInBytes, 12);
    }
}