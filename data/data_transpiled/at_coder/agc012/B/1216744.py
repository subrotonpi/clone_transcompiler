def import _solve
import sys
import getopt
import getopt
def main ( args ) :
    global Q , N , C
    global V , D , C , has_next_paint
    global N , Q , C , has_next_link
    str_lst = args
    V = [ int ( x ) for x in str_lst ]
    D = [ int ( x ) for x in str_lst ]
    C = [ int ( x ) for x in str_lst ]
    Q += 1
    def solve ( ) :
        for i in range ( Q - 1 , - 1 , - 1 ) :
            Vertexes [ i ].Paint ( D [ i ] , C [ i ] )
        for i in range ( 1 , N + 1 ) :
            print ( Vertexes [ i ].Color [ 0 ] )
    return solve
class Solver ( object ) :
    Vertexes = [ ]
    class Vertex ( object ) :
        def __init__ ( self , i ) :
            self.Idx = i
            self.Color = [ 0 ] * 11
            self.Link = [ ]
        def AddLink ( self , v ) :
            self.Link.append ( v )
        def Paint ( self , d , c ) :
            if self.Color [ d ] != 0 : return
            self.Color [ d ] = c
            if d > 0 :
                Vertexes [ self.Idx ].Paint ( d - 1 , c )
                for next in self.Link :
                    Vertexes [ next ].Paint ( d - 1 , c )
    def init ( ) :
        global N , M , Q , has_next_link
        global V , C , has_next_paint
        global N , M , Q , has_next_link
        global C , has_next_link
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
        global has_next_paint
