package nextstep.payments.ui.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import nextstep.payments.ui.theme.PaymentsTheme

internal class PaymentListActivity : ComponentActivity() {

    private val viewModel: PaymentListViewModel by viewModels(
        factoryProducer = { PaymentListViewModel.Factory() }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PaymentsTheme {
                PaymentListScreen(viewModel)
            }
        }
    }
}
