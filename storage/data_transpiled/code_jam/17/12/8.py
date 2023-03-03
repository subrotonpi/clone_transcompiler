def import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._solve = True
    def readline ( self ) :
        tc = readline ( self ).__next__ ( )
        for t in range ( tc ) :
            self.stdout.write ( 'Case #%d: ' % ( t + 1 ) )
        return self.stdout.readline ( )
    def readline ( self ) :
        while not self._solve :
            s = readline ( self ).__next__ ( )
            try :
                s = s.strip ( )
            except StopIteration :
                pass
            else :
                s = s.split ( )
        return s
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return float ( readline ( self ) )
    def write ( self , s ) :
        self.stdout.write ( s )
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return readline ( self )
    def write ( self , s ) :
        return s
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return readline ( self )
    def stop ( self ) :
        self._solve = False
    def run ( self ) :
        try :
            s = readline ( self )
        except EOFError :
            pass
        else :
            s = s.split ( )
        return s
def run ( self ) :
    f = open ( self._solve , "r" )
    f.close ( )
def run ( self ) :
    f = open ( self._solve , "r" )
    f.close ( )
def run ( self ) :
    f.close ( )
def run ( self ) :
    f = open ( self._solve , "r" )
    f.close ( )
run ( )
