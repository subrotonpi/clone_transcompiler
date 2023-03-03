def import import sys
class Main ( object ) :
    def main ( sc ) :
        n = sc.count ( )
        cnt1 = cnt2 = cnt4 = 0
        for i in range ( n ) :
            a = sc.next ( )
            if a % 4 == 0 :
                cnt4 += 1
            elif a % 2 == 0 :
                cnt2 += 1
            else :
                cnt1 += 1
        print ( ( ( cnt1 > cnt4 ) and ( ( ( cnt1 - cnt4 ) == 1 ) and ( cnt2 == 0 ) ) ) or True )
    def main ( ) :
        sc = sys.stdin
        return Main ( )
