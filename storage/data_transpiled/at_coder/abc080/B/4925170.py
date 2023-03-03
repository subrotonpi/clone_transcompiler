def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        s = str ( n )
        ch = s.decode ( 'utf-8' )
        sum = 0
        for c in ch :
            sum += c - '0'
        print ( 'Yes' if n % sum == 0 else 'No' )
