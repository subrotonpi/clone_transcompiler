def import import sys
import os
import subprocess
import sys
class Pancakes ( subprocess.Popen ) :
    def __init__ ( self ) :
        self.stdout = sys.stdout
        self.stdin = sys.stdin
    def do_case ( self , case_number ) :
        line = self.stdout.readline ( )
        scan = subprocess.Popen ( line.split ( ) , stdout = self.stdout )
        S = scan.stdout.read ( )
        changes = 0
        last = S [ 0 ]
        for curr in S [ 1 : ] :
            if curr != last :
                changes += 1
            last = curr
        if last == '-' :
            changes += 1
        print ( changes )
    def run ( self ) :
        self.num_cases = int ( self.stdin.readline ( ).strip ( ) )
        for i in range ( 1 , self.num_cases + 1 ) :
            print ( "Case #%d: " % i , end = ' ' )
            do_case ( self , i )
