def import import sys
import os
import sys
import subprocess
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.broken_button = sys.stdout.readline ( )
        string_list = self.stdin.readline ( ).split ( '' )
        for letter in string_list :
            if not letter in broken_button :
                sys.stdout.write ( letter )
        sys.stdout.write ( '\n' )
