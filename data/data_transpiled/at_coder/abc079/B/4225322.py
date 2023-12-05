def main ( srgs ) :
    import random
    random.seed ( 1 )
    a = random.randint ( 0 , 87 )
    L = [ 2 , 1 ]
    for i in range ( 2 , a + 1 ) :
        L.append ( L [ i - 1 ] + L [ i - 2 ] )
    print ( L [ a ] )
