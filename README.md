mcc-mnc
=======

1.mcc to 2-letter iso country code. 2. mcc/mnc tuple to carrier name

1. This java lib is used to translate Mobile Country Code to
   2-letter iso country code. 
   For example:
   MccMnc.isoCountryCode(460); will translate China's mcc (460) to "cn".
   
2. And it can translate Mobile Country Code/Mobile Network Code tuple to
   its correlated carrier name. 
   For example:
   MccMnc.carrier(460, 1); will return "China Unicom".
