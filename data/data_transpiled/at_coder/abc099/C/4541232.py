def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        dp = [ ]
        def __init__ ( self ) :
            N = sc.__next__ ( )
            dp = [ ]
            dp.append ( int ( N ) )
            dp.append ( 0 )
            self.calc ( N )
            print ( dp [ N ] )
        def calc ( self , n ) :
            for i in range ( 1 , n + 1 ) :
                power = 1
                ans = int ( n )
                while 0 <= i - power :
                    ans = min ( ans , 1 + dp [ i - power ] )
                    power *= 6
                power = 1
                while 0 <= i - power :
                    ans = min ( ans , 1 + dp [ i - power ] )
                    power *= 9
                dp.append ( ans )
