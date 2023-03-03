def import readline
import os
import sys
import os
import locale
import random
class d ( ) :
    def __init__ ( self ) :
        self.s = readline ( ).decode ( 'ascii' )
        self.qmarks , self.n = 0 , [ ]
        self.places = [ ]
        for i in range ( self.n ) :
            if i == '?' :
                self.places.append ( i )
                self.qmarks += 1
        for mask in range ( ( 1 << self.qmarks ) ) :
            cur = 0
            cmask = mask
            for i in range ( self.n ) :
                if i == '?' :
                    cur = cur * 2 + ( cmask % 2 )
                    cmask /= 2
                else :
                    cur = cur * 2 + ( i - '0' )
            sq = long ( round ( random.sqrt ( cur ) ) ) - 2
            for it in range ( 5 ) :
                if sq ** it == cur :
                    self.out.write ( str ( cur ) )
                    return
                sq += 1
    def run ( self ) :
        try :
            tc = randint ( 0 , 10 )
            for it in range ( 1 , tc + 1 ) :
                sys.stderr.write ( str ( it ) )
                sys.stderr.write ( 'Case #%d: ' % it )
                self.solve ( )
        except :
            NOO ( )
        finally :
            os.close ( )
    global out
    global St
    def NOO ( self ) :
        sys.exit ( 42 )
    def __next__ ( self ) :
        try :
            self.stdin = open ( self.name + '.in' , 'r' )
            St = [ ]
            out = open ( self.name + '.out' , 'w' )
        except :
            NOO ( )
        else :
            return
    def __next__ ( self ) :
        while not self.places :
            try :
                line = self.stdin.readline ( )
                if not line :
                    return
                St = [ ]
            except :
                NOO ( )
        return St
