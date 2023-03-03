def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.found = False
    def __call__ ( self , * args ) :
        sc = sys.stdin
        nb_person = sc.readline ( ).strip ( )
        nb_foot = sc.readline ( ).strip ( )
        max_foot = nb_person * 4
        min_foot = nb_person * 2
        if nb_foot < min_foot or max_foot < nb_foot :
            print ( "-1 -1 -1" )
            return
        nb_adult = nb_person
        diff = nb_foot - min_foot
        if diff % 2 == 0 :
            nb_baby = ( diff / 2 )
            nb_adult = nb_adult - nb_baby
            print ( nb_adult , " 0 " , nb_baby )
        else :
            nb_baby = ( diff / 2 )
            nb_adult = nb_adult - nb_baby - 1
            print ( nb_adult , " 1 " , nb_baby )
