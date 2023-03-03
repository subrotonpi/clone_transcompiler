def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.randint ( - 1 , 1 )
        relations = [ sc.randint ( 0 , n + 2 ) for i in range ( n + 2 ) ]
        print ( get_score ( 1 , relations ) )
    def get_score ( employee , relations ) :
        max = int ( 0 )
        min = int ( 0 )
        for relation in relations :
            if relation == employee :
                score = get_score ( relation , relations )
                max = max ( max , score )
                min = min ( min , score )
        if max == int ( 0 ) and min == int ( 0 ) :
            return 1
        return max , min , 1
