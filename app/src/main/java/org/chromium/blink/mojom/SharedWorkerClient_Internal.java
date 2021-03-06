
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/shared_worker_client.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class SharedWorkerClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<SharedWorkerClient, SharedWorkerClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<SharedWorkerClient, SharedWorkerClient.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.SharedWorkerClient";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, SharedWorkerClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public SharedWorkerClient[] buildArray(int size) {
          return new SharedWorkerClient[size];
        }
    };


    private static final int ON_CREATED_ORDINAL = 0;

    private static final int ON_CONNECTED_ORDINAL = 1;

    private static final int ON_SCRIPT_LOAD_FAILED_ORDINAL = 2;

    private static final int ON_FEATURE_USED_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements SharedWorkerClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onCreated(
int creationContextType) {

            SharedWorkerClientOnCreatedParams _message = new SharedWorkerClientOnCreatedParams();

            _message.creationContextType = creationContextType;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_CREATED_ORDINAL)));

        }


        @Override
        public void onConnected(
int[] featuresUsed) {

            SharedWorkerClientOnConnectedParams _message = new SharedWorkerClientOnConnectedParams();

            _message.featuresUsed = featuresUsed;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_CONNECTED_ORDINAL)));

        }


        @Override
        public void onScriptLoadFailed(
) {

            SharedWorkerClientOnScriptLoadFailedParams _message = new SharedWorkerClientOnScriptLoadFailedParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SCRIPT_LOAD_FAILED_ORDINAL)));

        }


        @Override
        public void onFeatureUsed(
int feature) {

            SharedWorkerClientOnFeatureUsedParams _message = new SharedWorkerClientOnFeatureUsedParams();

            _message.feature = feature;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_FEATURE_USED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<SharedWorkerClient> {

        Stub(org.chromium.mojo.system.Core core, SharedWorkerClient impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                SharedWorkerClient_Internal.MANAGER, messageWithHeader);





                    case ON_CREATED_ORDINAL: {

                        SharedWorkerClientOnCreatedParams data =
                                SharedWorkerClientOnCreatedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onCreated(data.creationContextType);
                        return true;
                    }





                    case ON_CONNECTED_ORDINAL: {

                        SharedWorkerClientOnConnectedParams data =
                                SharedWorkerClientOnConnectedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onConnected(data.featuresUsed);
                        return true;
                    }





                    case ON_SCRIPT_LOAD_FAILED_ORDINAL: {

                        SharedWorkerClientOnScriptLoadFailedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onScriptLoadFailed();
                        return true;
                    }





                    case ON_FEATURE_USED_ORDINAL: {

                        SharedWorkerClientOnFeatureUsedParams data =
                                SharedWorkerClientOnFeatureUsedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onFeatureUsed(data.feature);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), SharedWorkerClient_Internal.MANAGER, messageWithHeader, receiver);










                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class SharedWorkerClientOnCreatedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int creationContextType;

        private SharedWorkerClientOnCreatedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SharedWorkerClientOnCreatedParams() {
            this(0);
        }

        public static SharedWorkerClientOnCreatedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SharedWorkerClientOnCreatedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SharedWorkerClientOnCreatedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SharedWorkerClientOnCreatedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SharedWorkerClientOnCreatedParams(elementsOrVersion);
                    {
                        
                    result.creationContextType = decoder0.readInt(8);
                        SharedWorkerCreationContextType.validate(result.creationContextType);
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
            
            encoder0.encode(this.creationContextType, 8);
        }
    }



    
    static final class SharedWorkerClientOnConnectedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int[] featuresUsed;

        private SharedWorkerClientOnConnectedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SharedWorkerClientOnConnectedParams() {
            this(0);
        }

        public static SharedWorkerClientOnConnectedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SharedWorkerClientOnConnectedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SharedWorkerClientOnConnectedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SharedWorkerClientOnConnectedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SharedWorkerClientOnConnectedParams(elementsOrVersion);
                    {
                        
                    result.featuresUsed = decoder0.readInts(8, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    {
                        for (int i0 = 0; i0 < result.featuresUsed.length; ++i0) {
                            WebFeature.validate(result.featuresUsed[i0]);
                        }
                    }
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
            
            encoder0.encode(this.featuresUsed, 8, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        }
    }



    
    static final class SharedWorkerClientOnScriptLoadFailedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private SharedWorkerClientOnScriptLoadFailedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SharedWorkerClientOnScriptLoadFailedParams() {
            this(0);
        }

        public static SharedWorkerClientOnScriptLoadFailedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SharedWorkerClientOnScriptLoadFailedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SharedWorkerClientOnScriptLoadFailedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SharedWorkerClientOnScriptLoadFailedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SharedWorkerClientOnScriptLoadFailedParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class SharedWorkerClientOnFeatureUsedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int feature;

        private SharedWorkerClientOnFeatureUsedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SharedWorkerClientOnFeatureUsedParams() {
            this(0);
        }

        public static SharedWorkerClientOnFeatureUsedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SharedWorkerClientOnFeatureUsedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SharedWorkerClientOnFeatureUsedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SharedWorkerClientOnFeatureUsedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SharedWorkerClientOnFeatureUsedParams(elementsOrVersion);
                    {
                        
                    result.feature = decoder0.readInt(8);
                        WebFeature.validate(result.feature);
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
            
            encoder0.encode(this.feature, 8);
        }
    }



}
