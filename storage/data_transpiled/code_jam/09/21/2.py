def _ ( ) : return
import sys
import os
import getopt
class ProblemA :
    def __init__ ( self ) :
        self.pos = 0
    def get_item ( self , s , chars , single = True ) :
        while s [ pos ].isspace ( ) :
            pos += 1
        res = ""
        while s [ pos ] in chars :
            res += ord ( s [ pos ] )
            pos += 1
            if self.single : break
        return res
    class Tree :
        def __init__ ( self ) :
            self.feat = None
            self.p = float ( get_item ( self , "1234567890." , False ) )
            while s [ pos ].isspace ( ) :
                pos += 1
            if s [ pos ] != ")" :
                self.feat = self.pop ( )
                self.left , self.right = Tree ( self.left ) , Tree ( self.right )
            self.item = s [ pos : ]
        def do_main ( self ) :
            f = open ( "input.txt" , "r" )
            f.write ( "\n" )
            self.case_cnt = int ( f.readline ( ) )
            for case_num in range ( 1 , case_cnt + 1 ) :
                L = int ( f.readline ( ) )
                s = ""
                for i in range ( L ) :
                    s += f.readline ( )
                f.write ( "Case #%d:\n" % case_num )
                self.pos = 0
                t = Tree ( s )
                A = int ( f.readline ( ) )
                for i in range ( A ) :
                    have = set ( )
                    cur = f.readline ( )
                    n = int ( cur.n )
                    for j in range ( n ) :
                        have.add ( cur.feat )
                f.write ( "%.2f" % ( res ) )
            f.flush ( )
            f.close ( )
    f.close ( )
