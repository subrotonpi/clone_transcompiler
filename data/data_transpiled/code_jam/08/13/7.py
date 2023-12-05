def _import ( ) :
    import decimal
    import decimal
    import sys
    class Numbers :
        dec = decimal.Decimal ( '5.2360679774997896964091736687313' )
        def __init__ ( self , case_num , case_num ) :
            self.case_num = case_num
            self.case_num = case_num
        def __repr__ ( self ) :
            string = dec.pow ( self.case_num , self.case_num ).to_plain ( )
            ndx = string.find ( '.' )
            if ndx > 2 :
                result = string [ ndx - 3 : ndx ]
            else :
                result = '0' + string [ : ndx ]
            print ( "Case #%d: %s" % ( case_num , result ) )
    return Numbers
