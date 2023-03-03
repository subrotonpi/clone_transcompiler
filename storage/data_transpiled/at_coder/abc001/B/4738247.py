def main ( ) :
    import sys
    from time import sleep
    from math import log as f
    m = f.recv_match ( )
    mm = m / 1000.0
    vvd = 0
    if mm < 0.1 :
        vvd = 0
    elif mm >= 0.1 and mm <= 5 :
        vvd = int ( mm * 10 )
    elif mm >= 6 and mm <= 30 :
        vvd = int ( mm + 50 )
    elif mm >= 35 and mm <= 70 :
        vvd = int ( ( mm - 30 ) / 5 + 80 )
    elif mm > 70 :
        vvd = 89
    vv = "%02d" % vvd
    print ( vv )
