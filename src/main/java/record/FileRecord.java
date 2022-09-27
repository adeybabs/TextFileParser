package record;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileRecord {
    public String desId;
    public String desCurCode;
    public String sourceId;
    public String sourceAmt;
    public String reasonCode;
    public String sourceCurCode;
    public String countryCode;
    public String settlementFlag;
    public String eventDate;
    public String transactionId;
    public String acctNoAndExt;
    public String centralProcDt;
    public String desAmt;
    public String reimbursementAttr;
    public String msgTxt;




    @Override
    public String toString() {
        return "FileRecord{" +
                "desId='" + desId + '\'' +
                ", desCurCode='" + desCurCode + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", sourceAmt='" + sourceAmt + '\'' +
                ", reasonCode='" + reasonCode + '\'' +
                ", sourceCurCode='" + sourceCurCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", settlementFlag='" + settlementFlag + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", acctNoAndExt='" + acctNoAndExt + '\'' +
                ", centralProcDt='" + centralProcDt + '\'' +
                ", desAmt='" + desAmt + '\'' +
                ", reimbursementAttr='" + reimbursementAttr + '\'' +
                ", msgTxt='" + msgTxt + '\'' +
                '}';
    }
}


