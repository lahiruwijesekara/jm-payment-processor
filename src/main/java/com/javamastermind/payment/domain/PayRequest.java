package com.javamastermind.payment.domain;

/**
 * @author lahiru_w
 */
public class PayRequest
{
    private String cardNumber;

    private String expDate;

    private String cvc;

    private String cardHolderName;

    private String cardType;

    private String amount;

    private String tranId;

    public String getCardNumber()
    {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public String getExpDate()
    {
        return expDate;
    }

    public void setExpDate(String expDate)
    {
        this.expDate = expDate;
    }

    public String getCvc()
    {
        return cvc;
    }

    public void setCvc(String cvc)
    {
        this.cvc = cvc;
    }

    public String getCardHolderName()
    {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName)
    {
        this.cardHolderName = cardHolderName;
    }

    public String getCardType()
    {
        return cardType;
    }

    public void setCardType(String cardType)
    {
        this.cardType = cardType;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getTranId()
    {
        return tranId;
    }

    public void setTranId(String tranId)
    {
        this.tranId = tranId;
    }

    @Override
    public String toString()
    {
        return "PayRequest [cardNumber=" + cardNumber + ", expDate=" + expDate + ", cvc=" + cvc + ", cardHolderName="
            + cardHolderName + ", cardType=" + cardType + ", amount=" + amount + ", tranId=" + tranId + "]";
    }

}
