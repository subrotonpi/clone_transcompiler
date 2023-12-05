def main ( ) :
    import os
    from math import fabs
    scn = os.popen ( "/usr/bin/scn" )
    A , B , C , D = scn.read ( ).split ( )
    ans = fabs ( A - C ) <= D or ( ( fabs ( A - B ) <= D ) and ( fabs ( C - B ) <= D ) )
    print ( "Yes" if ans else "No" )
