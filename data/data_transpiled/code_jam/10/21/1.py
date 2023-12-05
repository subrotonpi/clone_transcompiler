def import import os , sys , time
from os import urandom
import time
class Solution ( object ) :
    class Tree ( object ) :
        mp = { }
        def __init__ ( self ) :
            self.root = Tree ( )
        def process ( self , add ) :
            s = self.root
            items = s.split ( '/' )
            cur = self.root
            for item in items :
                if item not in cur.mp :
                    cur.mp [ item ] = Tree ( )
                    if add :
                        res += 1
                self.cur = cur.mp [ item ]
    def do_main ( ) :
        with open ( 'input.txt' , 'r' ) as sc :
            with open ( 'output.txt' , 'w' ) as pw :
                casecnt = sc.read ( )
                time = time.time ( )
                for casenum in range ( 1 , casecnt + 1 ) :
                    have , next = sc.read ( ).split ( '/' )
                    root = Tree ( )
                    res = 0
                    for i in range ( have ) :
                        process ( i , False )
                    for i in range ( next ) :
                        process ( i , True )
                    pw.write ( 'Case #%d: %d\n' % ( casenum , res ) )
                print ( 'Finished testcase %d, time = %d' % ( casenum , time.time ( ) - time.time ( ) ) )
