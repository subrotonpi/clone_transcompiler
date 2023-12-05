def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    from itertools import chain
    from random import shuffle
    from itertools import chain
    N = randint ( 1 , N )
    graph = { }
    for n in chain ( range ( N - 1 ) , repeat ( N ) ) :
        a , b , c = next ( chain ( range ( N ) , N ) )
        update_graph ( a , b , c , graph )
        update_graph ( b , a , c , graph )
    distances = chain ( range ( N + 1 ) , repeat ( N ) )
    Q , K = next ( chain ( range ( N ) , N ) )
    dijkstra ( N , graph , K , distances )
    x , y = zip ( * ( range ( Q ) ) )
    for i in range ( Q ) :
        print ( distances [ x [ i ] ] + distances [ y [ i ] ] )
    def update_graph ( a , b , c , graph ) :
        to = { }
        if graph.has_key ( a ) :
            to = graph [ a ]
        to [ b ] = c
        graph [ a ] = to
    def dijkstra ( n , graph , start , distances ) :
        INF = sum ( distances )
        distances [ start ] = INF
        nodes_queue = chain ( range ( n ) , [ ] )
        while not nodes_queue.empty ( ) :
            node = nodes_queue.get ( )
            to_node_costs = graph [ node ]
            for e , move_cost in to_node_costs.items ( ) :
                if move_cost and distances [ node ] > distances [ node ] + move_cost :
                    distances [ node ] = distances [ node ] + move_cost
                    nodes_queue.task_done ( )
    for node in distances :
        print ( node , distances [ node ] )
