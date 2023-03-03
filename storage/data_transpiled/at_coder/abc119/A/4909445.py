def import datetime
import datetime
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        S = sc.read ( )
        dt = datetime.datetime.strptime ( S , '%Y/%m/%d' )
        date1 = datetime.datetime.strptime ( dt , '%Y/%m/%d' )
        date2 = datetime.datetime.strptime ( '2019/04/30' , '%Y/%m/%d' )
        if date1 == date2 or date1 == date2 :
            print ( 'Heisei' )
        else :
            print ( 'TBD' )
