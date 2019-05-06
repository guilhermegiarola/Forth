import java.io.*
import java.util.*

class Forth{
	public void Operacoes(Stack st);
	public void Print(Stack st);
	public void Duplica(Stack st);
	public void Drop(Stack st);
	public void Swap(Stack st);
	public void Rot(Stack st);
	public void Over(Stack st);
	public void Tuck(Stack st);
	public void PrintString(Stack st);
}

	void Operacoes(Stack st){
		if(st.peek() == "+"){
			st.pop();
			int a = Integer.parseInt(st.pop());
			int b = Integer.parseInt(st.pop());
			int aux = a + b;
			String aux2 = Integer.toString(aux);
			st.push(aux2);
		}

		else if(st.peek() == "-"){
			st.pop();
			int a = Integer.parseInt(st.pop());
			int b = Integer.parseInt(st.pop());
			int aux = a - b;
			String aux2 = Integer.toString(aux);
			st.push(aux2);
		}

		else if(st.peek() == "*"){
			st.pop();
			int a = Integer.parseInt(st.pop());
			int b = Integer.parseInt(st.pop());
			int aux = a * b;
			String aux2 = Integer.toString(aux);
			st.push(aux2);
		}

		else if(st.peek() == "/"){
			st.pop();
			int a = Integer.parseInt(st.pop());
			int b = Integer.parseInt(st.pop());
			int aux = a / b;
			String aux2 = Integer.toString(aux);
			st.push(aux2);
		}

		else if(st.peek() == "%"){
			st.pop();
			int a = Integer.parseInt(st.pop());
			int b = Integer.parseInt(st.pop());
			int aux = a % b;
			String aux2 = Integer.toString(aux);
			st.push(aux2);
		}

		void Print(Stack st){
			System.out.println(st.pop());
		}

		void Duplica(Stack st){
			st.push(st.peek());
		}

		void Drop(Stack st){
			st.pop();
		}

		void Swap(Stack st){
			String aux = st.pop();
			String aux2 = st.pop();
			st.push(aux);
			st.push(aux2);
		}

		void Rot(Stack st){
			//????
		}

		void Over(Stack st){
			String aux = st.pop();
			String aux2 = st.peek();
			st.push(aux);
			st.push(aux2);
		}

		void Tuck(Stack st){
			String aux = st.pop();
			String aux2 = st.pop();
			st.push(aux);
			st.push(aux2);
			st.push(aux);
		}

		void PrintString(Stack st){
			System.out.println(st.pop());
			st.pop();
		}

		void ExecuteStack(Stack st){
			while(stack.peek()!= null){
				switch(stack.peek()){
					case "+":
						Operacoes(stack);
					case "-":
						Operacoes(stack);
					case "*":
						Operacoes(stack);
					case "/":
						Operacoes(stack);
					case "%":
						Operacoes(stack);
					case ".":
						Print(stack);
					case "dup":
						Duplica(stack);
					case "drop":
						Drop(stack);
					case "swap":
						Swap(stack);
					case "rot":
						Rot(stack);
					case "over":
						Over(stack);
					case "tuck":
						Tuck(stack);
					case "(/')":
						PrintString(stack);
				}
			}
		}

		public static void main(String[] args){
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Escolha a opção desejada: ");
			System.out.println("1 - Executar código Forth.");
			System.out.println("2 - Carregar código Forth.");
			System.out.println("3 - Gravar código Forth.");
			System.out.println("4 - Criar/Editar código Forth");

			int option = reader.nextInt();

			switch(option){
				case 1:
					String str = reader.nextLine();

					Stack stack = new Stack();
			
					for (String word:str){
						stack.push(word);	
					}
					ExecuteStack(stack);

				case 2:
					//Carregar código Forth de arquivo, colocar em uma string e executar "ExecuteStack".
				case 3:
					//Gravar String com o código Forth em um arquivo-texto.
					String str = reader.nextLine();
				case 4:
					//Carregar código Forth de arquivo, modificar a string e carregar para o arquivo-texto novamente.
			}
		}
	}

