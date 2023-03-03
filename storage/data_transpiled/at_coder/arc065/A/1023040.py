def __match ( temp , start , data ) :
    import os
    import re
    class Main ( object ) :
        def match ( self , temp , start , data ) :
            if start + len ( temp ) > len ( data ) : return False
            for j in range ( len ( temp ) ) :
                if temp [ j ] != data [ j + start ] : return False
            return True
    def main ( self ) :
        array = ( 'dreamer' , 'dream' , 'eraser' , 'erase' )
        data = data.split ( '\n' )
        start = 0
        last = - 1
        while start < len ( data ) and start >= 0 :
            flag = False
            for j in range ( 4 ) :
                if match ( temp [ j ] , start , data ) :
                    start += len ( temp [ j ] )
                    flag = True
                    last = j
                    break
            if not flag and last == 0 :
                start -= 2
                last = - 1
            elif not flag : break
        if start == len ( data ) :
            print ( 'YES' )
        else :
            print ( 'NO' )
