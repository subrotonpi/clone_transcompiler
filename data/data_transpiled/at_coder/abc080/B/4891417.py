def main ( ) :
    import sys
    import os
    import subprocess
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            input = sys.stdin.readline ( )
            n = int ( input.strip ( ) )
            print ( 'Yes' if n % self.get_sum ( n ) == 0 else 'No' )
        def get_sum ( n ) :
            sum = 0
            while n > 9 :
                sum += n % 10
                n /= 10
            if n > 0 :
                sum += n
            return sum
    return Main ( )
