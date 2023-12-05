def main ( ) :
    import sys
    import os
    import subprocess
    class Main ( object ) :
        def __init__ ( self ) :
            input = sys.stdin.readline ( )
            a = input.strip ( )
            print ( 'vowel' in a and 'consonant' in a )
    return Main ( )
