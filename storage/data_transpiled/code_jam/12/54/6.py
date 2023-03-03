def gcj ( ) : return
import os
import sys
import os
import sys
class Lost ( object ) :
    PROBLEM_NAME = "lost"
    WORK_DIR = r"D:\Gcj\\"+PROBLEM_NAME+" \ \"
    def preprocess ( self ) :
        pass
    def solve ( self , sc , f ) :
        k = sc.count ( )
        s = sc.read ( )
        eq = { 'o' : '0' , 'i' : '1' , 'e' : '3' , 'a' : '4' , 's' : '5' , 't' : '7' , 'b' : '8' , 'g' : '9' }
        char_id = { }
        [ char_id [ c ] for c in s if c in can ]
        if len ( s ) == 1 :
            return
        edg = { }
        for a , b in zip ( char_id , s [ 1 : ] ) :
            c , d = ( eq [ a ] , eq [ b ] )
            if d != - 1 :
                edg [ a ] [ d ] = 1
            if c != - 1 and d != - 1 :
                edg [ c ] [ d ] = 1
        return
    def solve ( self , sc , f ) :
        sc = open ( WORK_DIR + "input.txt" , "r" )
        f = open ( WORK_DIR + "output.txt" , "w" )
        for c in sc :
            if c in can :
                return
        for a in s :
            if c in can :
                return
        return
    for c in s :
        if c in can :
            return
        if c in can :
            return
        if c in can :
            return
        if d in can :
            return
        if c in can :
            return
        if d in can :
            return
    if c in can :
        return
    if d in can :
        return
    if c in can :
        return
    if d in can :
        return
    raise Exception ( "Could not find lost of %s" % c )
