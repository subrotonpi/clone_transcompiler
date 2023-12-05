def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def main ( ) :
        sc = sys.stdin
        n = sc.readline ( )
        min = sys.maxint
        for i in range ( 1 , n // 2 + 1 ) :
            a = n - i
            b = i
            sum = 0
            while a > 0 :
                sum += a % 10
                a /= 10
            while b > 0 :
                sum += b % 10
                b /= 10
            if min > sum :
                min = sum
        sys.stdout.write ( min )
