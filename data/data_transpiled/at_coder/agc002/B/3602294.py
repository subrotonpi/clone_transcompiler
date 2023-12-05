def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        boxes = sc.readline ( ).split ( )
        operations = sc.readline ( ).split ( )
        red_possible = [ True ] * ( boxes + 1 )
        box_balls = [ 1 ] * ( boxes + 1 )
        possibility = 0
        for i in range ( 1 , len ( box_balls ) ) :
            box_balls [ i ] = 1
        for i in range ( operations ) :
            pick = sc.readline ( ).split ( ) [ 0 ]
            put = sc.readline ( ).split ( ) [ 1 ]
            if red_possible [ pick ] == True :
                red_possible [ put ] = True
            box_balls [ pick ] = box_balls [ pick ] - 1
            box_balls [ put ] = box_balls [ put ] + 1
            if box_balls [ pick ] == 0 :
                red_possible [ pick ] = False
        for i in range ( len ( red_possible ) ) :
            if red_possible [ i ] != False :
                possibility += 1
        print ( possibility )
