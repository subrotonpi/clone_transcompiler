def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N , self.K , self.a = - 1 , - 1
    ans = ''
    for i in range ( 1 , N + 1 ) :
        get = 0
        tri = i
        for _ in range ( 2 , K + 1 ) :
            if tri % 2 == 0 :
                tri /= 2
                get += 1
            else :
                break
        if a < get :
            a = get
            ans = '%d' % i
    print ( ans )
