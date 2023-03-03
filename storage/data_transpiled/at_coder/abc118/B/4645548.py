def import _count_of_answers
import os
import sys
import itertools
import csv
class Main ( object ) :
    def __init__ ( self ) :
        sc = csv.reader ( sys.stdin )
        answers = sc.next ( )
        kinds = sc.next ( )
        like_counts = [ 0 ] * ( kinds + 1 )
        for i in range ( answers ) :
            anscount = csv.reader ( sys.stdin )
            for j in range ( anscount ) :
                like_counts [ i ] += 1
        print ( csv.reader ( like_counts ).count ( ) )
