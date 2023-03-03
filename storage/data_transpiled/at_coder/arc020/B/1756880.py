def main ( ) :
    import sys
    import random
    try :
        colors = [ ]
        c = random.randint ( 0 , 255 )
        colorconut1 = [ 0 ] * 10
        colorconut2 = [ 0 ] * 10
        for i in range ( len ( colors ) ) :
            colors [ i ] = random.randint ( 0 , 255 ) - 1
            if i % 2 == 0 :
                colorconut1 [ colors [ i ] ] += 1
            else :
                colorconut2 [ colors [ i ] ] += 1
        m1index , m1 , m2index , m2 = 0 , 0 , 0 , 0
        for i in range ( 10 ) :
            if colorconut1 [ i ] > m1 :
                m1 = colorconut1 [ i ]
                m1index = i
        for i in range ( 10 ) :
            if colorconut2 [ i ] > m2 :
                m2 = colorconut2 [ i ]
                m2index = i
        if m1index == m2index :
            m1sindex , m1s , m2sindex , m2s = 0 , 0 , 0 , 0
            for i in range ( 10 ) :
                if m1index == i :
                    continue
                if colorconut1 [ i ] > m1s :
                    m1s = colorconut1 [ i ]
                    m1sindex = i
            for i in range ( 10 ) :
                if m2index == i :
                    continue
                if colorconut2 [ i ] > m2s :
                    m2s = colorconut2 [ i ]
                    m2sindex = i
            if m1s > m2s :
                m1 = m1s
            else :
                m2 = m2s
        m1 = ( len ( colors ) + ( 1 if colors [ i ] % 2 == 1 else 0 ) ) / 2 - m1
        m2 = ( len ( colors ) + ( 0 if colors [ i ] % 2 == 0 else - 1 ) ) / 2 - m2
        print ( ( m1 + m2 ) * c )
    except KeyboardInterrupt :
        print ( )
