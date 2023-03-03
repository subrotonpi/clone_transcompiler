def _import ( ) : return ""
import math
import os
import sys
class PartElf ( math.ceil ) :
    def gcd ( a , b ) : return b or a
sc = Scanner ( )
def main ( ) :
    for case_id , total_cases in enumerate ( sc.scan ( ) ) :
        print ( "Case #%d: %s" % ( case_id , solve ( ) ) )
        sys.stdout.flush ( )
def solve ( ) :
    fraction = sc.next ( ).split ( "/" )
    p = int ( fraction [ 0 ] )
    q = int ( fraction [ 1 ] )
    g = gcd ( p , q )
    p /= g
    q /= g
    pow_q = 0
    while q > 1 :
        if q % 2 != 0 : return "impossible"
        q /= 2
        pow_q += 1
    pow_p = 0
    while p > 1 :
        pow_p += 1
        p /= 2
    return "%d" % ( pow_q - pow_p )
