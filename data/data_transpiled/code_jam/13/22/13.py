def _ import _ , os , sys , os , code , compile , code , code , sys ) :
    import os
    import sys
    import random
    import random
    import locale
    import tokenize as tokenize as tokenize
    class B ( object ) :
        def __init__ ( self ) :
            sys.exit ( 42 )
        def __next__ ( self ) :
            return int ( self.__next__ ( ) )
        def __next__ ( self ) :
            return float ( self.__next__ ( ) )
        def __next__ ( self ) :
            while not self.__next__ ( ) :
                try :
                    line = tokenize.next ( )
                    if not line : return None
                else :
                    return line
            self.__next__ -= self.__next__
        def __next__ ( self ) :
            try :
                self.__next__ = next ( )
            except StopIteration :
                return None
    def main ( ) :
        with open ( name + ".in" , "r" ) as f :
            St = tokenize.next ( )
    target_layer = ( x + y ) // 2
    max_h = target_layer * 2
    if target_layer <= layer :
        print ( "1.0" , file = sys.stderr )
        return
    elif target_layer > layer + 1 or y == target_layer * 2 :
        print ( "0.0" , file = sys.stderr )
        return
    count_left = n - sum
    prob = [ [ 1 ] * max_h + 1 , [ 1 ] * max_h + 1 ]
    for i in range ( 1 , count_left + 1 ) :
        for left in range ( min ( i , max_h + 1 ) ) :
            right = i - left - 1
            if right > max_h :
                continue
            for it in range ( 2 ) :
                new_left , new_right = left + it , right + ( 1 - it )
                if new_left == max_h + 1 and new_right == max_h + 1 :
                    print ( "!!!" , file = sys.stderr )
                if new_left == max_h + 1 :
                    del new_left
                    del new_right
                prob [ new_left ] [ new_right ] += prob [ left ] [ right ] * 0.5
    ans = 0
    for left in range