def import import os , glob
import glob
class R1C ( object ) :
    BIG = 100003
    def __init__ ( self , * args ) :
        with open ( 'C-large.in' , 'r' ) as infile , open ( 'C-large.out' , 'w' ) as outfile :
            binom = [ [ 1 , 0 ] ] * 600
            binom [ 0 ] [ 0 ] = 1
            binom [ 1 ] [ 0 ] = binom [ 1 ] [ 1 ] = 1
            for n in range ( 2 , 600 ) :
                binom [ n ] [ 0 ] = binom [ n ] [ n ] = 1
                for r in range ( 1 , n ) :
                    binom [ n ] [ r ] = ( binom [ n - 1 ] [ r ] + binom [ n - 1 ] [ r - 1 ] ) % BIG
        cas = glob.glob ( 'C-large.in' )
        for iii in range ( cas ) :
            N = glob.glob ( 'C-large.in' )
            table = [ [ 0 ] * N + [ 0 ] * N + [ 1 ] * N + [ 1 ] * N + [ 2 ] * N + [ 2 ] * N + [ 3 ] * N + [ 4 ] * N + [ 5 ] * N + [ 6 ] * N + [ 7 ] * N + [ 7 ] * N + [ 8 ] * N + [ 9 ] * N + [ 10 ] * N + [ 11 ] * N + [ 11 ] * N + [ 12 ] * N + [ 13 ] * N + [ 13 ] * N + [ 14 ] * N + [ 15 ] * N + [ 15 ] * N + [ 16 ] * N + [ 15 ] * N + [ 16 ] * N + [ 15 ] * N + [ 16 ] * N + [ 17 ] * N + [ 18 ] * N + [ 19 ] * N + [ 19 ] * N + [ 20 ] * N + [ 19 ] * N + [ 20 ] * N + [ 20 ] * N + [ 20 ] * N + [ 20 ] * N + [ 20 ] * N + [ 20 ] * N + [ 20 ] * N + [ 20 ] * N + [ 20 ] * N + [ 20 ] * N + [ 20