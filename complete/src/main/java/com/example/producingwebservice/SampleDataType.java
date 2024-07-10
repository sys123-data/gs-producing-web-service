package com.example.producingwebservice;


import jakarta.xml.bind.annotation.XmlRootElement;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;

@XmlRootElement
public class SampleDataType {
    private String simpleString;
    private String normalizedString;
    private String token;
    private boolean booleanValue;
    private BigDecimal decimalValue;
    private BigInteger integerValue;
    private BigInteger nonPositiveIntegerValue;
    private BigInteger negativeIntegerValue;
    private long longValue;
    private int intValue;
    private short shortValue;
    private byte byteValue;
    private BigInteger nonNegativeIntegerValue;
    private BigInteger unsignedLongValue;
    private long unsignedIntValue;
    private int unsignedShortValue;
    private short unsignedByteValue;
    private BigInteger positiveIntegerValue;
    private double doubleValue;
    private float floatValue;
    private XMLGregorianCalendar dateTimeValue;
    private XMLGregorianCalendar timeValue;
    private XMLGregorianCalendar dateValue;
    private XMLGregorianCalendar gYearMonthValue;
    private XMLGregorianCalendar gYearValue;
    private XMLGregorianCalendar gMonthDayValue;
    private XMLGregorianCalendar gDayValue;
    private XMLGregorianCalendar gMonthValue;
    private javax.xml.datatype.Duration durationValue;
    private byte[] base64BinaryValue;
    private byte[] hexBinaryValue;
    private String anyURIValue;
    private javax.xml.namespace.QName qNameValue;
    private javax.xml.namespace.QName notationValue;
    private String languageValue;
    private String nameValue;
    private String ncNameValue;
    private javax.xml.datatype.Duration yearMonthDurationValue;
    private javax.xml.datatype.Duration dayTimeDurationValue;

    public String getSimpleString() {
        return simpleString;
    }

    public void setSimpleString(String simpleString) {
        this.simpleString = simpleString;
    }

    public String getNormalizedString() {
        return normalizedString;
    }

    public void setNormalizedString(String normalizedString) {
        this.normalizedString = normalizedString;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public BigDecimal getDecimalValue() {
        return decimalValue;
    }

    public void setDecimalValue(BigDecimal decimalValue) {
        this.decimalValue = decimalValue;
    }

    public BigInteger getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(BigInteger integerValue) {
        this.integerValue = integerValue;
    }

    public BigInteger getNonPositiveIntegerValue() {
        return nonPositiveIntegerValue;
    }

    public void setNonPositiveIntegerValue(BigInteger nonPositiveIntegerValue) {
        this.nonPositiveIntegerValue = nonPositiveIntegerValue;
    }

    public BigInteger getNegativeIntegerValue() {
        return negativeIntegerValue;
    }

    public void setNegativeIntegerValue(BigInteger negativeIntegerValue) {
        this.negativeIntegerValue = negativeIntegerValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public BigInteger getNonNegativeIntegerValue() {
        return nonNegativeIntegerValue;
    }

    public void setNonNegativeIntegerValue(BigInteger nonNegativeIntegerValue) {
        this.nonNegativeIntegerValue = nonNegativeIntegerValue;
    }

    public BigInteger getUnsignedLongValue() {
        return unsignedLongValue;
    }

    public void setUnsignedLongValue(BigInteger unsignedLongValue) {
        this.unsignedLongValue = unsignedLongValue;
    }

    public long getUnsignedIntValue() {
        return unsignedIntValue;
    }

    public void setUnsignedIntValue(long unsignedIntValue) {
        this.unsignedIntValue = unsignedIntValue;
    }

    public int getUnsignedShortValue() {
        return unsignedShortValue;
    }

    public void setUnsignedShortValue(int unsignedShortValue) {
        this.unsignedShortValue = unsignedShortValue;
    }

    public short getUnsignedByteValue() {
        return unsignedByteValue;
    }

    public void setUnsignedByteValue(short unsignedByteValue) {
        this.unsignedByteValue = unsignedByteValue;
    }

    public BigInteger getPositiveIntegerValue() {
        return positiveIntegerValue;
    }

    public void setPositiveIntegerValue(BigInteger positiveIntegerValue) {
        this.positiveIntegerValue = positiveIntegerValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public XMLGregorianCalendar getDateTimeValue() {
        return dateTimeValue;
    }

    public void setDateTimeValue(XMLGregorianCalendar dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }

    public XMLGregorianCalendar getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(XMLGregorianCalendar timeValue) {
        this.timeValue = timeValue;
    }

    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    public void setDateValue(XMLGregorianCalendar dateValue) {
        this.dateValue = dateValue;
    }

    public XMLGregorianCalendar getgYearMonthValue() {
        return gYearMonthValue;
    }

    public void setgYearMonthValue(XMLGregorianCalendar gYearMonthValue) {
        this.gYearMonthValue = gYearMonthValue;
    }

    public XMLGregorianCalendar getgYearValue() {
        return gYearValue;
    }

    public void setgYearValue(XMLGregorianCalendar gYearValue) {
        this.gYearValue = gYearValue;
    }

    public XMLGregorianCalendar getgMonthDayValue() {
        return gMonthDayValue;
    }

    public void setgMonthDayValue(XMLGregorianCalendar gMonthDayValue) {
        this.gMonthDayValue = gMonthDayValue;
    }

    public XMLGregorianCalendar getgDayValue() {
        return gDayValue;
    }

    public void setgDayValue(XMLGregorianCalendar gDayValue) {
        this.gDayValue = gDayValue;
    }

    public XMLGregorianCalendar getgMonthValue() {
        return gMonthValue;
    }

    public void setgMonthValue(XMLGregorianCalendar gMonthValue) {
        this.gMonthValue = gMonthValue;
    }

    public Duration getDurationValue() {
        return durationValue;
    }

    public void setDurationValue(Duration durationValue) {
        this.durationValue = durationValue;
    }

    public byte[] getBase64BinaryValue() {
        return base64BinaryValue;
    }

    public void setBase64BinaryValue(byte[] base64BinaryValue) {
        this.base64BinaryValue = base64BinaryValue;
    }

    public byte[] getHexBinaryValue() {
        return hexBinaryValue;
    }

    public void setHexBinaryValue(byte[] hexBinaryValue) {
        this.hexBinaryValue = hexBinaryValue;
    }

    public String getAnyURIValue() {
        return anyURIValue;
    }

    public void setAnyURIValue(String anyURIValue) {
        this.anyURIValue = anyURIValue;
    }

    public QName getqNameValue() {
        return qNameValue;
    }

    public void setqNameValue(QName qNameValue) {
        this.qNameValue = qNameValue;
    }

    public QName getNotationValue() {
        return notationValue;
    }

    public void setNotationValue(QName notationValue) {
        this.notationValue = notationValue;
    }

    public String getLanguageValue() {
        return languageValue;
    }

    public void setLanguageValue(String languageValue) {
        this.languageValue = languageValue;
    }

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public String getNcNameValue() {
        return ncNameValue;
    }

    public void setNcNameValue(String ncNameValue) {
        this.ncNameValue = ncNameValue;
    }

    public Duration getYearMonthDurationValue() {
        return yearMonthDurationValue;
    }

    public void setYearMonthDurationValue(Duration yearMonthDurationValue) {
        this.yearMonthDurationValue = yearMonthDurationValue;
    }

    public Duration getDayTimeDurationValue() {
        return dayTimeDurationValue;
    }

    public void setDayTimeDurationValue(Duration dayTimeDurationValue) {
        this.dayTimeDurationValue = dayTimeDurationValue;
    }


}
