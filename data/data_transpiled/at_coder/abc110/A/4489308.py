def main ( case ) :
    import heapq
    import sys
    class Main ( TestCase ) :
        def process ( self ) :
            A = case.A
            B = case.B
            C = case.C
            pq = heapq.heapq.PriorityQueue ( ( lambda a , b : cmp ( b , a ) ) )
            pq.append ( A )
            pq.append ( B )
            pq.append ( C )
            max , smaller , smallest = no_inspect_get ( pq )
            return str ( max * 10 + smaller + smallest )
        def no_inspect_get ( pq ) :
            return pq.pop ( )
    case = read_from_input ( )
    result = process ( case )
    output ( result )
    def read_from_input ( ) :
        with open ( 'input.txt' , 'r' ) as f :
            A = f.read ( )
            B = f.read ( )
            C = f.read ( )
        return { 'A' : A , 'B' : B , 'C' : C }
    def output ( result ) :
        print ( result )
    class Main ( TestCase ) :
        def process ( self ) :
            A = case.A
            B = case.B
            C = case.C
    return Main
