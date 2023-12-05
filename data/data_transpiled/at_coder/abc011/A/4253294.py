def main ( ) :
    import sys
    import os
    try :
        with open ( '/proc/cpuinfo' , 'r' ) as f :
            num = f.read ( )
        num += 1
        if num >= 13 :
            num = 1
        print ( num )
    except :
        print ( '/proc/cpuinfo' )
