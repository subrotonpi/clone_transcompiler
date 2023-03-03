def main ( ) :
    import sys
    import os
    import subprocess
    class Main ( object ) :
        def __init__ ( self ) :
            input = sys.stdin.readline ( )
            n = int ( input.strip ( ) )
            print ( 'Yes' if n == self._revers ( n ) else 'No' )
        def _revers ( self ) :
            reverse = 0
            while n > 9 :
                reverse = reverse * 10 + ( n % 10 )
                n //= 10
            if n > 0 :
                reverse = reverse * 10 + self._revers ( n )
            return reverse
    return Main ( )
