def import import math
import string
import sys
import math
import string
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.split ( " " )
        s = sc.strip ( )
        bi = int ( s )
        bione = bi + 1
        bisq = bi * bi
        hyaku = int ( 100 )
        bionesq = bione * bione - 1
        while True :
            a1 = bisq // hyaku
            if bisq % hyaku > 0 :
                a1 = a1 + 1
            a2 = bionesq // hyaku
            if a1 <= a2 :
                bisq = a1
                bionesq = a2
            else :
                break
        print ( bisq )
        return
