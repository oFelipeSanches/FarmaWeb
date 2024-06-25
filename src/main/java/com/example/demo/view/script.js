document.getElementById('registroForm').addEventListener('submit', async (event) => {
    event.preventDefault(); // Evita o envio padrão do formulário

    const tipo = document.getElementById('tipo').value;
    const nome = document.getElementById('nome').value;
    const endereco = document.getElementById('endereco').value;
    const cidade = document.getElementById('cidade').value;
    const estado = document.getElementById('estado').value;

    const data = {
        tipo: tipo,
        nome: nome,
        endereco: endereco,
        cidade: cidade,
        estado: estado
    };

    try {
        const response = await fetch('http://localhost:8080/farmacia/cadastrarFarmacia', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        });

        if (response.ok) {
            const result = await response.json();
            console.log('Registro salvo:', result);
            carregarDados(); // Atualiza a lista de estabelecimentos
        } else {
            console.error('Erro ao salvar registro:', response.statusText);
        }
    } catch (error) {
        console.error('Erro ao enviar a requisição:', error);
    }
});

async function carregarDados() {
    try {
        const response = await fetch('http://localhost:8080/farmacia/listarFarmacias');
        const dados = await response.json();

        const lista = document.querySelector('#lista tbody');
        lista.innerHTML = ''; // Limpa a tabela

        dados.forEach(dado => {
            const linha = lista.insertRow();
            linha.insertCell().textContent = dado.tipo;
            linha.insertCell().textContent = dado.nome;
            linha.insertCell().textContent = dado.endereco;
            linha.insertCell().textContent = dado.cidade;
            linha.insertCell().textContent = dado.estado;
        });
    } catch (error) {
        console.error('Erro ao carregar dados:', error);
    }
}

document.addEventListener('DOMContentLoaded', carregarDados);
