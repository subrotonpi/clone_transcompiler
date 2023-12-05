def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.res = max ( max ( ( a % 100 + 900 ) - b , a - ( b % 100 + 100 ) ) , max ( ( a / 100 * 100 + a % 10 + 90 - b ) , ( a - ( b / 100 * 100 + b % 10 ) ) ) , max ( ( a / 10 * 10 + 9 - b ) , ( a - ( b / 10 * 10 ) ) ) )
        self.print ( self.res )
