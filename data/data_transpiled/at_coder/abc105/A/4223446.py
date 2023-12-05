def import _csv
import csv
import sys
import csv
import os
import sys
class Main ( sys.stdout ) :
    def __init__ ( self ) :
        sys.stdout = sys.__stdout__
        sys.__stdout__ = csv.writer ( sys.__stdout__ )
        self.N = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
        if self.N % K == 0 :
            res = 0
        else :
            res = 1
        self.csv.writerow ( [ str ( res ) ] )
