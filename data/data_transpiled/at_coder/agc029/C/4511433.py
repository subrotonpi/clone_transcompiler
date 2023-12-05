def main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    from itertools import chain
    n = len ( chain ( sys.stdin.readline ( ).strip ( ).split ( ) ) )
    lengths = chain ( [ len ( sys.stdin.readline ( ) ) for i in range ( n ) ] )
    for i in chain ( 1 , n ) :
        if lengths [ i ] <= lengths [ i - 1 ] :
            break
    if i == n :
        print ( 1 )
        return
    a = 1
    b = n
    while a + 1 < b :
        m = ( a + b ) // 2
        isOk = check ( m , lengths )
        if isOk :
            b = m
        else :
            a = m
    print ( b )
    class Element :
        def __init__ ( self , pos , value ) :
            self.pos = pos
            self.value = value
        def check ( self , m , lengths ) :
            stack = chain ( [ ] , [ ] )
            for i in range ( 1 , len ( lengths ) ) :
                if lengths [ i ] > lengths [ i - 1 ] :
                    continue
                while not stack.empty ( ) :
                    end = stack [ - 1 ]
                    if end.pos > lengths [ i ] :
                        stack.pop ( )
                    else :
                        break
                carry = 1
                target_pos = lengths [ i ]
                while not stack.empty ( ) :
                    end = stack [ - 1 ]
                    if end.pos == target_pos :
                        stack.pop ( )
                        if end.value + carry < m :
                            stack.push ( ( target_pos , end.value + carry ) )
                            carry = 0
                            break
                        target_pos -= 1
                    elif end.pos < target_pos :
                        stack.push ( ( target_pos , 1 ) )
                        carry = 0
                        break
                if carry > 0 :
                    if target_pos >= 1 :
                        stack.push ( ( target_pos , 1 ) )
                    else :
                        return False
                return True
    return Element ( )
