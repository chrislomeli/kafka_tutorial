/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.chrislomeli.examples.orderEventSchema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OrderEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -2235516601113407770L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderEvent\",\"namespace\":\"orderEventSchema.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"timestamp\",\"type\":{\"type\":\"string\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"product\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"float\"}]}");
    public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<OrderEvent> ENCODER =
            new BinaryMessageEncoder<OrderEvent>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<OrderEvent> DECODER =
            new BinaryMessageDecoder<OrderEvent>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<OrderEvent> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<OrderEvent> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<OrderEvent> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<OrderEvent>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Serializes this OrderEvent to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /**
     * Deserializes a OrderEvent from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a OrderEvent instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static OrderEvent fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    @Deprecated public int id;
    @Deprecated public java.lang.CharSequence timestamp;
    @Deprecated public java.lang.CharSequence product;
    @Deprecated public float price;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public OrderEvent() {}

    /**
     * All-args constructor.
     * @param id The new value for id
     * @param timestamp The new value for timestamp
     * @param product The new value for product
     * @param price The new value for price
     */
    public OrderEvent(java.lang.Integer id, java.lang.CharSequence timestamp, java.lang.CharSequence product, java.lang.Float price) {
        this.id = id;
        this.timestamp = timestamp;
        this.product = product;
        this.price = price;
    }

    public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
    public org.apache.avro.Schema getSchema() { return SCHEMA$; }
    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0: return id;
            case 1: return timestamp;
            case 2: return product;
            case 3: return price;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0: id = (java.lang.Integer)value$; break;
            case 1: timestamp = (java.lang.CharSequence)value$; break;
            case 2: product = (java.lang.CharSequence)value$; break;
            case 3: price = (java.lang.Float)value$; break;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'id' field.
     * @return The value of the 'id' field.
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the value of the 'id' field.
     * @param value the value to set.
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the 'timestamp' field.
     * @return The value of the 'timestamp' field.
     */
    public java.lang.CharSequence getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the value of the 'timestamp' field.
     * @param value the value to set.
     */
    public void setTimestamp(java.lang.CharSequence value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the 'product' field.
     * @return The value of the 'product' field.
     */
    public java.lang.CharSequence getProduct() {
        return product;
    }


    /**
     * Sets the value of the 'product' field.
     * @param value the value to set.
     */
    public void setProduct(java.lang.CharSequence value) {
        this.product = value;
    }

    /**
     * Gets the value of the 'price' field.
     * @return The value of the 'price' field.
     */
    public float getPrice() {
        return price;
    }


    /**
     * Sets the value of the 'price' field.
     * @param value the value to set.
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Creates a new OrderEvent RecordBuilder.
     * @return A new OrderEvent RecordBuilder
     */
    public static OrderEvent.Builder newBuilder() {
        return new OrderEvent.Builder();
    }

    /**
     * Creates a new OrderEvent RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new OrderEvent RecordBuilder
     */
    public static OrderEvent.Builder newBuilder(OrderEvent.Builder other) {
        if (other == null) {
            return new OrderEvent.Builder();
        } else {
            return new OrderEvent.Builder(other);
        }
    }

    /**
     * Creates a new OrderEvent RecordBuilder by copying an existing OrderEvent instance.
     * @param other The existing instance to copy.
     * @return A new OrderEvent RecordBuilder
     */
    public static OrderEvent.Builder newBuilder(OrderEvent other) {
        if (other == null) {
            return new OrderEvent.Builder();
        } else {
            return new OrderEvent.Builder(other);
        }
    }

    /**
     * RecordBuilder for OrderEvent instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderEvent>
            implements org.apache.avro.data.RecordBuilder<OrderEvent> {

        private int id;
        private java.lang.CharSequence timestamp;
        private java.lang.CharSequence product;
        private float price;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(OrderEvent.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.timestamp)) {
                this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.product)) {
                this.product = data().deepCopy(fields()[2].schema(), other.product);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
            if (isValidValue(fields()[3], other.price)) {
                this.price = data().deepCopy(fields()[3].schema(), other.price);
                fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }
        }

        /**
         * Creates a Builder by copying an existing OrderEvent instance
         * @param other The existing instance to copy.
         */
        private Builder(OrderEvent other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.timestamp)) {
                this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.product)) {
                this.product = data().deepCopy(fields()[2].schema(), other.product);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.price)) {
                this.price = data().deepCopy(fields()[3].schema(), other.price);
                fieldSetFlags()[3] = true;
            }
        }

        /**
         * Gets the value of the 'id' field.
         * @return The value.
         */
        public int getId() {
            return id;
        }


        /**
         * Sets the value of the 'id' field.
         * @param value The value of 'id'.
         * @return This builder.
         */
        public OrderEvent.Builder setId(int value) {
            validate(fields()[0], value);
            this.id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'id' field has been set.
         * @return True if the 'id' field has been set, false otherwise.
         */
        public boolean hasId() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'id' field.
         * @return This builder.
         */
        public OrderEvent.Builder clearId() {
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'timestamp' field.
         * @return The value.
         */
        public java.lang.CharSequence getTimestamp() {
            return timestamp;
        }


        /**
         * Sets the value of the 'timestamp' field.
         * @param value The value of 'timestamp'.
         * @return This builder.
         */
        public OrderEvent.Builder setTimestamp(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.timestamp = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'timestamp' field has been set.
         * @return True if the 'timestamp' field has been set, false otherwise.
         */
        public boolean hasTimestamp() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'timestamp' field.
         * @return This builder.
         */
        public OrderEvent.Builder clearTimestamp() {
            timestamp = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'product' field.
         * @return The value.
         */
        public java.lang.CharSequence getProduct() {
            return product;
        }


        /**
         * Sets the value of the 'product' field.
         * @param value The value of 'product'.
         * @return This builder.
         */
        public OrderEvent.Builder setProduct(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.product = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'product' field has been set.
         * @return True if the 'product' field has been set, false otherwise.
         */
        public boolean hasProduct() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'product' field.
         * @return This builder.
         */
        public OrderEvent.Builder clearProduct() {
            product = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'price' field.
         * @return The value.
         */
        public float getPrice() {
            return price;
        }


        /**
         * Sets the value of the 'price' field.
         * @param value The value of 'price'.
         * @return This builder.
         */
        public OrderEvent.Builder setPrice(float value) {
            validate(fields()[3], value);
            this.price = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'price' field has been set.
         * @return True if the 'price' field has been set, false otherwise.
         */
        public boolean hasPrice() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'price' field.
         * @return This builder.
         */
        public OrderEvent.Builder clearPrice() {
            fieldSetFlags()[3] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public OrderEvent build() {
            try {
                OrderEvent record = new OrderEvent();
                record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
                record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.product = fieldSetFlags()[2] ? this.product : (java.lang.CharSequence) defaultValue(fields()[2]);
                record.price = fieldSetFlags()[3] ? this.price : (java.lang.Float) defaultValue(fields()[3]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<OrderEvent>
            WRITER$ = (org.apache.avro.io.DatumWriter<OrderEvent>)MODEL$.createDatumWriter(SCHEMA$);

    @Override public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<OrderEvent>
            READER$ = (org.apache.avro.io.DatumReader<OrderEvent>)MODEL$.createDatumReader(SCHEMA$);

    @Override public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override protected boolean hasCustomCoders() { return true; }

    @Override public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException
    {
        out.writeInt(this.id);

        out.writeString(this.timestamp);

        out.writeString(this.product);

        out.writeFloat(this.price);

    }

    @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException
    {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.id = in.readInt();

            this.timestamp = in.readString(this.timestamp instanceof Utf8 ? (Utf8)this.timestamp : null);

            this.product = in.readString(this.product instanceof Utf8 ? (Utf8)this.product : null);

            this.price = in.readFloat();

        } else {
            for (int i = 0; i < 4; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.id = in.readInt();
                        break;

                    case 1:
                        this.timestamp = in.readString(this.timestamp instanceof Utf8 ? (Utf8)this.timestamp : null);
                        break;

                    case 2:
                        this.product = in.readString(this.product instanceof Utf8 ? (Utf8)this.product : null);
                        break;

                    case 3:
                        this.price = in.readFloat();
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }
}






