def _solve_c ( ) :
    import decimal
    import decimal
    import decimal
    import decimal
    import datetime
    import time
    import os
    import sys
    class Main ( object ) :
        def _solve_c2 ( self ) :
            super ( Main , self )._solve_c2 ( )
        def _solve_a ( self ) :
            try :
                with open ( self._solve_a ) as f :
                    date = ''
            except IOError :
                date = ''
            else :
                date = f.read ( )
            sd_format = datetime.strptime ( date , '%Y/%m/%d' )
            u_date = datetime.strptime ( a_date , '%Y/%m/%d' )
            t_date = datetime.strptime ( '2019/04/30' , '%Y/%m/%d' )
            diff = t_date - datetime.strptime ( b_date , '%Y/%m/%d' )
            if diff == 0 :
                print ( 'Heisei' )
            elif diff > 0 :
                print ( 'Heisei' )
            else :
                print ( 'TBD' )
        def _solve_b ( self ) :
            try :
                with open ( self._solve_b ) as f :
                    num_n = f.read ( )
            except IOError :
                num_n = 0
                num_s = 0
            wks_naiyo = [ ]
            wks_res = [ ]
            rate = decimal.Decimal ( '380000.0' )
            for i in range ( num_n ) :
                wks_naiyo.append ( decimal.Decimal ( f.read ( ) ) )
                wks_naiyo.append ( i )
                if wks_naiyo [ i ] == 'BTC' :
                    wks_res.append ( wks_naiyo [ i ] * rate )
                else :
                    wks_res.append ( wks_naiyo [ i ] )
            res = decimal.Decimal ( 0 )
            for i in wks_res :
                res = res + wks_res [ i ]
            print ( res.quantize ( decimal.Decimal ( 4 ) ) )
    return Main ( )
